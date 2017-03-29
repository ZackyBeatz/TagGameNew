/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagver3;

/**
 *
 * @author Zack
 */
public class RoomFactory {

    public Room[][] createRooms() {

        // initalise room
        Room[][] roomMatrix = new Room[3][3];
       
        Accessories[] newItems = new AccessFactory().createItems();
      
        // initalise position for each room
        roomMatrix[0][0] = new Room(1, "\n"
                    + "--------------------------------------------------------------------\n"
                            + "You are in the entrance room.\n "
                + "You find some gold and pick it up \n"
                + "Suddenly you hear a large crash and see a lot of dust coming\n"
                + "out of the tunnel you just left. \n"
                + "There are two tunnels leading out of this room. One heading north\n"
                + "and one heading east.\n"
                + "--------------------------------------------------------------------", 3);

        roomMatrix[0][1] = new Room(2, "\n"
                    + "--------------------------------------------------------------------\n"
                            + "Your enter a large room. It is so large\n"
                + "that you can hear the ecco of your breathing.\n"
                + "You find more some goldcoins and automatically pick them up.\n"
                + "There at two doors in this room.\n"
                + "One headed north and one headed west.\n"
                + "--------------------------------------------------------------------", 6);

        roomMatrix[0][2] = new Room(3,"\n"
                    + "--------------------------------------------------------------------\n"
                + "This a long, and narrow room. You can\n"
                + "choose an opening west or one south.\n"
                + " --------------------------------------------------------------------", 8);

        roomMatrix[1][0] = new Room(4, "\n"
                    + "--------------------------------------------------------------------\n"
                + "You are know entering a small room. It \n"
                + "has an opening to the east and one to the west.\n"
                + "--------------------------------------------------------------------", 4);

        roomMatrix[1][1] = new Room(5, "\n"
                    + "--------------------------------------------------------------------\n"
                + "In this room you see an old chair \n "
                + "and two openings. Choose south or east.\n"
                + "--------------------------------------------------------------------", 9);

        roomMatrix[1][2] = new Room(6,"\n"
                    + "--------------------------------------------------------------------\n"
                + "Now you find a room with a statue of an angel\n"
                + "There are 3 openings. Go east, north or south.\n"
                + "--------------------------------------------------------------------", 7);

        roomMatrix[2][0] = new Room(7,"\n"
                    + "--------------------------------------------------------------------\n"
                + "It looks as you have entered a tomb. \n"
                + "This room contains a large coffin. You can flee either to  \n"
                + "the north or the west.\n"
                + "--------------------------------------------------------------------", 6);
        roomMatrix[2][1] = new Room(8, "\n"
                    + "--------------------------------------------------------------------\n"
                + "In this room the walls are sloping. \n"
                + "You can choose between a south or a west opening.\n"
                + "--------------------------------------------------------------------", 4);

        roomMatrix[2][2] = new Room(9,"\n"
                    + "--------------------------------------------------------------------\n"
                + "You are almost blinded by the light of the outside world.\n"
                + "--------------------------------------------------------------------", 5);

        // EXITS FOR EACH ROOM
        // DOOR 1
        roomMatrix[0][0].setNorth(roomMatrix[2][1]);
        roomMatrix[0][0].setEast(roomMatrix[0][1]);

        // DOOR 2
        roomMatrix[0][1].setNorth(roomMatrix[0][2]);
        roomMatrix[0][1].setWest(roomMatrix[0][0]);

        // DOOR 3
        roomMatrix[0][2].setWest(roomMatrix[1][0]);
        roomMatrix[0][2].setSouth(roomMatrix[0][1]);

        // door 4
        roomMatrix[1][0].setEast(roomMatrix[0][2]);
        roomMatrix[1][0].setWest(roomMatrix[1][1]);

        // door 5
        roomMatrix[1][1].setSouth(roomMatrix[1][2]);
        roomMatrix[1][1].setEast(roomMatrix[1][0]);

        // door 6
        roomMatrix[1][2].setEast(roomMatrix[2][1]);
        roomMatrix[1][2].setNorth(roomMatrix[1][1]);
        roomMatrix[1][2].setSouth(roomMatrix[2][0]);

        // door 7
        roomMatrix[2][0].setNorth(roomMatrix[1][2]);
        roomMatrix[2][0].setWest(roomMatrix[2][2]);

        // door 8
        roomMatrix[2][1].setSouth(roomMatrix[0][0]);
        roomMatrix[2][1].setWest(roomMatrix[1][2]);

        // door 9
        roomMatrix[2][2].setEast(roomMatrix[2][0]);
        // door west == victory ???;
        
        
        // SET ITEMS ON EACH ROOM 
        // PROBLEM ?? SO FAR I CAN ONLY HAVE ONE ITEM PER ROOM
        
        // DOOR 1
        
        roomMatrix[0][0].setRoomItem(newItems);
        //roomMatrix[0][0].setRoomItem(newItems[0]);
        // DOOR 2
        //roomMatrix[0][1].setRoomItem(newItems[1]);
        // DOOR 3
        // DOOR 4
        // DOOR 5
        // DOOR 6
        // DOOR 7
        // DOOR 8
        // DOOR 9
        
        return roomMatrix;
    }
    
    // mix items for each room
    
}
