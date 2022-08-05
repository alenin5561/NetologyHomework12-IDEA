public class AfishaManager {

    //переменная типа массив для сохранения фильмов
    private PurchaseFilms[] films = new PurchaseFilms[0];

    //переменная для храниния количества фильмов
    private int limit;

    //конструктор без параметров
    public AfishaManager() {
        this.limit = 10;
    }
    //параметризированный конструктор

    public AfishaManager(int limit) {
        this.limit = limit;
    }


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
        //отмечаю что первый массив это новый массив
        films = tmp;
    }

    //метод для вывода фильмов
    public PurchaseFilms[] getFilms() {

        return films;
    }

    public PurchaseFilms[] findLast() {
        int resultLength;
        if (limit < films.length) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        //создаю массив
        PurchaseFilms[] tmp = new PurchaseFilms[resultLength];
        //прохожу по всей длине массива
        for (int i = 0; i < tmp.length; i++) {
            //копирую заполненые ячейки в обратном порядке
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }


}


