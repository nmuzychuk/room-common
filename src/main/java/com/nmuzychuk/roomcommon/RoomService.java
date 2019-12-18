package com.nmuzychuk.roomcommon;

import java.util.Optional;

public interface RoomService {

    Room addRoom();

    Room findRoom(Long roomId);

    void dirtyRoom(Long roomId);

    void cleanRoom(Long roomId);
}
