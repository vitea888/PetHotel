package lambda_practice;

import java.util.*;

public class PetHotelLambdaVsLoop {

    public static void main(String[] args) {

        // Sample data
        List<String> pets = new ArrayList<>(List.of("Bella", "Max", "Luna", "Rocky", "Milo", "Nala"));
        Map<String, Integer> petAges = new HashMap<>();
        petAges.put("Bella", 2);
        petAges.put("Max", 5);
        petAges.put("Luna", 1);
        petAges.put("Rocky", 3);
        petAges.put("Milo", 6);
        petAges.put("Nala", 4);

        // =====================================================
        // Task 1 – Print all pets
        // =====================================================
        System.out.println("---- Task 1: Print all pets ----");
        // Without Lambda
        for (String pet : pets) {
            System.out.println("Pet (loop): " + pet);
        }
        // With Lambda






        /*
        // =====================================================
        // Task 2 – Print pets starting with 'M'
        // =====================================================
        System.out.println("\n---- Task 2: Pets starting with 'M' ----");
        // Without Lambda
        for (String pet : pets) {
            if (pet.startsWith("M")) {
                System.out.println("Pet with M (loop): " + pet);
            }
        }
        // With Lambda
         */



        /*
        // =====================================================
        // Task 3 – Print pets with names longer than 4 letters
        // =====================================================
        System.out.println("\n---- Task 3: Pets with name length > 4 ----");
        // Without Lambda
        for (String pet : pets) {
            if (pet.length() > 4) {
                System.out.println("Long name (loop): " + pet);
            }
        }
        // With Lambda
         */



        /*
        // =====================================================
        // Task 4 – Print pets whose names contain 'a'
        // =====================================================
        System.out.println("\n---- Task 4: Pets containing 'a' ----");
        // Without Lambda
        for (String pet : pets) {
            if (pet.toLowerCase().contains("a")) {
                System.out.println("Contains 'a' (loop): " + pet);
            }
        }
        // With Lambda
         */


        /*
        // =====================================================
        // Task 5 – Count pets older than 3
        // =====================================================
        System.out.println("\n---- Task 5: Count pets older than 3 ----");
        // Without Lambda

            }
        }
        System.out.println("Count (loop): " + count);
        // With Lambda
        long countLambda = petAges.entrySet().stream()
                .map(entry -> entry.getValue())
                .filter(age -> age > 3)
                .count();
        System.out.println("Count (lambda): " + countLambda);
         */



        /*
        // =====================================================
        // Task 6 – Find the oldest pet
        // =====================================================
        System.out.println("\n---- Task 6: Oldest pet ----");
        // Without Lambda
        String oldestPet = "";
        int maxAge = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : petAges.entrySet()) {
            if (entry.getValue() > maxAge) {
                maxAge = entry.getValue();
                oldestPet = entry.getKey();
            }
        }
        System.out.println("Oldest pet (loop): " + oldestPet + " (" + maxAge + " years)");
        // With Lambda
        petAges.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry -> System.out.println("Oldest pet (lambda): " + entry.getKey() + " (" + entry.getValue() + " years)"));

         */


        /*
        // =====================================================
        // Task 6 – Find the oldest pet
        // =====================================================
        System.out.println("\n---- Task 6: Oldest pet ----");
        // Without Lambda
        String oldestPet = "";
        int maxAge = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : petAges.entrySet()) {
            if (entry.getValue() > maxAge) {
                maxAge = entry.getValue();
                oldestPet = entry.getKey();
            }
        }
        System.out.println("Oldest pet (loop): " + oldestPet + " (" + maxAge + " years)");
        // With Lambda
        petAges.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry -> System.out.println("Oldest pet (lambda): " + entry.getKey() + " (" + entry.getValue() + " years)"));

         */







    }
}