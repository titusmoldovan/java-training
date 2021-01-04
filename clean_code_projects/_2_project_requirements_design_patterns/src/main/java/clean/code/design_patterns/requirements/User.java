package clean.code.design_patterns.requirements;

public class User {
        private final Character character;
        private final Mediator world;

        public User(Character character, Mediator mediator) {
                this.character = character;
                this.world = mediator;
                this.world.addEntity(this);
        }

        public void sendMessage(String message){
                this.world.sendMessage(message);
        }

        public void receiveMessage(String message){
                System.out.println(character.getName() + ": " + message);
        }

        @Override
        public String toString() {
                return "User{" + character +
                        ", world=" + world + '}';
        }
}
