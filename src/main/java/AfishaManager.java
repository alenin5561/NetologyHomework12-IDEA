public class AfishaManager {

    //переменная типа массив для сохранения фильмов
    private PurchaseFilms[] films = new PurchaseFilms[0];

    //метод для сохранения фильмов
    public void save(PurchaseFilms film) {
        //создаю новый массив
        PurchaseFilms[] tmp = new PurchaseFilms[films.length + 1];
        //копирую все из старого в новый с шагом +1
        for (int i = 0; i < films.length; i++) {
            //сохраняю в новый массив , содержимое первого массива
            tmp[i] = films[i];
        }
        //Необходимо заполнить ячейку,поэтому переношу параметр который указваю в новый массив
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    //метод для вывода фильмов
    public PurchaseFilms[] getFilms() {
        return films;

    }


}
