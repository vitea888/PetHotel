public class MyPetEverest {
    private String petName; private String ownerName;

    public MyPetEverest() {
        this.petName = "Everest";
        this.ownerName = "Hishge";
    }

    public void checkIn(PetHotel hotel) {
        hotel.checkIn(petName, ownerName);
    }
}
