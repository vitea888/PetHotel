# PetHotel
Each student creates their own pet class and integrates it into the shared PetHotel project stored on GitHub.



👥 Student Tasks (Each of the 6 students)

Each student does the following:

Clone the repo locally.

Create their own branch, Example: Victors-Pet

Create their own class named MyPetOwnersName.java, PetHotel -> PetInn -> src -> Create new Class MyPetOwnersName.java,  
Example for Alice:

public class MyPetAlice {
    private String petName;
    private String ownerName;

    public MyPetAlice() {
        this.petName = "Buddy";
        this.ownerName = "Alice";
    }

    public void checkIn(PetHotel hotel) {
        hotel.checkIn(petName, ownerName);
    }
}


Final Integration

Once all 6 students merge their classes, they can modify PetHotelClients.java to check in all pets:

public class PetHotelClients {
    public static void main(String[] args) {
        PetHotel hotel = new PetHotel();

        new MyPetAlice().checkIn(hotel);
        new MyPetBob().checkIn(hotel);
        new MyPetCharlie().checkIn(hotel);
        new MyPetDiana().checkIn(hotel);
        new MyPetEve().checkIn(hotel);
        new MyPetFrank().checkIn(hotel);
    }
}

✅ Learning Outcomes

Practice Java OOP by creating classes.

Learn Git basics: branching, committing, pushing, pull requests.

Learn how to collaborate on GitHub without overwriting each other’s work.
