package clean.code.design_patterns.requirements;


public class Main {

    public static void main(String[] args) {

        // ================== Basic implementation ===================
        //
        // Character hard = new Character("Hard", 16, "punk", "pink");
        //
        // ===========================================================
        //
        // Used Builder design pattern for a cleaner look while showing precise information when creating a character.
        // Easy to scale and to keep track of each character feature.
        //
        // ================= Builder implementation ==================
        //
        // Character first = new Builder("FirstCharacter")
        //                               .hairStyle("punk")
        //                               .hairColor("black")
        //                               .age(16)
        //                               .build();
        //
        //============================================================
        //
        // REAL LIFE EXAMPLE:
        // When creating your character in a MMORPG game you can choose from a list of features, including clothes,
        // talents or traits. When you are done customizing, you press "CONFIRM" which is the equivalent of .build().

        Character first = new Builder("FirstCharacter")
                                                     .hairStyle("punk")
                                                     .hairColor("black")
                                                     .age(16)
                                                     .build();

        Character second = new Builder("SecondCharacter")
                                                      .hairStyle("bald")
                                                      .hairColor("red")
                                                      .age(27)
                                                      .build();

        Character third = new Builder("ThirdCharacter")
                                                     .hairStyle("afro")
                                                     .hairColor("pink")
                                                     .age(36)
                                                     .build();

        Character fourth = new Builder("FourthCharacter")
                                                      .hairStyle("spikes")
                                                      .hairColor("purple")
                                                      .age(8)
                                                      .build();

        // ================== Basic implementation ===================
        //
        // Creating the "world" as a list, adding all users to the list, making custom classes for sender_user,
        // message, receiver_user, etc.
        //
        // ===========================================================
        //
        // Used Mediator design pattern for less code and simpler logic.
        // Easy to add new features.
        //
        // ================= Mediator implementation =================
        //
        // Mediator world01 = new Mediator();
        // User user01 = new User(first, world01);
        // User user02 = new User(second, world01);
        //
        //============================================================
        //
        // REAL LIFE EXAMPLE:
        // Environment for the characters created previously, VIP Subscriptions, Text/Voice Chats.

        Mediator world01 = new Mediator();
        User user01 = new User(first, world01);
        User user02 = new User(second, world01);

        Mediator world02 = new Mediator();
        User user03 = new User(third, world02);
        User user04 = new User(fourth, world02);

        System.out.println(user01.toString());
        System.out.println(user02.toString());
        System.out.println(user03.toString());
        System.out.println(user04.toString());
    }
}
