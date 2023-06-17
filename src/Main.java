public class Main {
    public static void main(String[] args) {

        enum WeaponType {
            SWORD,
            AXE,
            BOW
        }

        class Weapon {
            private WeaponType type;
            private String name;

            public Weapon(WeaponType type, String name) {
                this.type = type;
                this.name = name;
            }

            public WeaponType getType() {
                return type;
            }

            public void setType(WeaponType type) {
                this.type = type;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        class GameEntity {
            private String name;
            private int health;

            public GameEntity(String name, int health) {
                this.name = name;
                this.health = health;
            }


            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getHealth() {
                return health;
            }

            public void setHealth(int health) {
                this.health = health;
            }
        }

        class Boss extends GameEntity {
            private Weapon weapon;

            public Boss(String name, int health, Weapon weapon) {
                super(name, health);
                this.weapon = weapon;
            }

            public Weapon getWeapon() {
                return weapon;
            }

            public void setWeapon(Weapon weapon) {
                this.weapon = weapon;
            }
        }
                Weapon weapon = new Weapon(WeaponType.SWORD, "Excalibur");
                Boss boss = new Boss("Evil Boss", 1000, weapon);

                // Вывод информации о боссе
                System.out.println("Boss Name: " + boss.getName());
                System.out.println("Boss Health: " + boss.getHealth());
                System.out.println("Boss Weapon Type: " + boss.getWeapon().getType());
                System.out.println("Boss Weapon Name: " + boss.getWeapon().getName());
            }
        }

