package hw04122020;

public class Main {

    public static void main(String[] args) {
        class Person {
            private String fio;
            private String post;
            private String email;
            private String tel;
            private double salary;
            private int age;

            Person(String fio, String post, String email, String tel, double salary, int age) {
                this.fio = fio;
                this.post = post;
                this.email = email;
                this.tel = tel;
                this.salary = salary;
                if(age >= 18) {
                    this.age = age;
                } else {
                    System.out.println("Сотрудник должен быть старше 18 лет");
                }
            }

            int GetAge() {
                return age;
            }

            void Show() {
                System.out.println(fio + " " + post + " " +  email + " " + tel + " " + salary + " " + age);
            }
        }

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Кузнецов Николай", "Токарь", "kyzman@mailbox.com", "8923123125", 30000, 38);
        persArray[1] = new Person("Шведова Татьяна", "Фармоцевт", "shedtanya@mailbox.com", "89756483398", 40000, 40);
        persArray[2] = new Person("Сафонова Людмила", "Кассир", "safonova@mailbox.com", "89458762288", 50000, 50);
        persArray[3] = new Person("Антонов Владимир", "Товаровед", "anton@mailbox.com", "89783456723", 60000, 46);
        persArray[4] = new Person("Макаров Андрей", "Юрист", "makarov@mailbox.com", "89778881313", 70000, 41);

        for(Person item : persArray) {
            if(item.GetAge() > 40) item.Show();
        }
    }
}

