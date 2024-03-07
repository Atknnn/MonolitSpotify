package com.atakan.MonolitSpotify.repository;

import com.atakan.MonolitSpotify.repository.entity.UserProfile;
import com.atakan.MonolitSpotify.repository.view.VwUserProfile;
import com.atakan.MonolitSpotify.utility.enums.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {


    @Query("select new com.muhammet.MonolitSpotify.repository.view.VwUserProfile(u.id,u.userName,u.resimUrl) from UserProfile u")
    List<VwUserProfile> findAllFromUserProfileView();





    boolean existsByUserName(String userName);


    boolean existsByIdAndUserType(Long id, UserType userType);



}
