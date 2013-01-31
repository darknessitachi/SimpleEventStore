package com.ticktockdevelopment.simpleeventstore.Messaging.Events;

public class InventoryItemDeactivated extends Event {
    public int Id;

    public InventoryItemDeactivated(int id) {
        Id = id;
    }


    @Override
    public String toString() {
        return "InventoryItemDeactivated - "+"Id:"+Id+" "+super.toString();
    }
}
