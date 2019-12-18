package com.nmuzychuk.roomcommon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Room implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private RoomState state;

    public Room() {
        state = RoomState.DIRTY;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoomState getState() {
        return state;
    }

    public void setState(RoomState state) {
        this.state = state;
    }
}
