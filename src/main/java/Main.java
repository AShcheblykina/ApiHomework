public class Main {

    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = 893845685;
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate().toString();
        post.day = 13;
        post.month = 6;
        post.year = 1999;

        // заполните другие поля даты рождения
    }

}


