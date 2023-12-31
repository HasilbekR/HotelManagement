package com.example.hotelmanagement.repository;

import com.example.hotelmanagement.entity.room.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface RoomRepository extends JpaRepository<RoomEntity, UUID> {
    Optional<RoomEntity> findRoomEntityByNumber(String number);
}
