package Consts;

import com.github.javafaker.Faker;

public class Constants {

    static Faker faker = new Faker();
    public static final String URL = "https://stellarburgers.nomoreparties.site/";
    public static final String email = faker.name().firstName()+"@ya.ru";
    public static final String password = faker.name().lastName()+"pass";
    public static final String wrongPassword = "1234";
    public static final String name = faker.name().username();
    public static final String staticEmail = "vvvv3n4i@yandex.ru";
    public static final String staticPassword = "Dendy1356";
}
