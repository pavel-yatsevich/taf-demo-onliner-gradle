package by.itacedemy.yatsevcih.page;

public class LoginPage {
    public static final String LOGIN_FORM_NICK_OR_EMAIL_XPATH = "//input[@placeholder='Ник или e-mail']";
    public static final String LOGIN_FORM_PASSWORD_XPATH = "input[@placeholder=placeholder='Пароль']";
    public static final String LOGIN_FORM_BUTTON_ENTER_XPATH = "//button[@class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']";
    public static final String LOGIN_FORM_ERROR_MESSAGE_EMAIL_XPATH = "//div[contains(text(), 'Укажите ник или e-mail')]";
    public static final String LOGIN_FORM_ERROR_MESSAGE_PASSWORD_XPATH = "//div[contains(text(), 'Укажите пароль')]";
}
