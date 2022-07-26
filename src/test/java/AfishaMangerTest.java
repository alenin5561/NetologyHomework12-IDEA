import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AfishaMangerTest {

    AfishaManager manager = new AfishaManager();

    PurchaseFilms film1 = new PurchaseFilms("Бладшот");
    PurchaseFilms film2 = new PurchaseFilms("Вперёд");
    PurchaseFilms film3 = new PurchaseFilms("Отель Белград");
    PurchaseFilms film4 = new PurchaseFilms("Джентельмены");
    PurchaseFilms film5 = new PurchaseFilms("Человек-неведимка");
    PurchaseFilms film6 = new PurchaseFilms("Тролли.Мировой тур");
    PurchaseFilms film7 = new PurchaseFilms("Номер один");
    PurchaseFilms film8 = new PurchaseFilms("Бэтмен");
    PurchaseFilms film9 = new PurchaseFilms("Однажды в голливуде");
    PurchaseFilms film10 = new PurchaseFilms("Стрингер");

    @Test
    public void SaveTest() {
        AfishaManager manager = new AfishaManager();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);

        PurchaseFilms[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        PurchaseFilms[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void ShowLimitFilms() {
        AfishaManager manager = new AfishaManager(6);
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);

        PurchaseFilms[] expected = {film10, film9, film8, film7, film6, film5};
        PurchaseFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}
