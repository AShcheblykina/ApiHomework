public class Main {

    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = 893845685;
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        int day = 13;
        int month = 6;
        int year = 1999;

        // заполните другие поля даты рождения
    }

}


