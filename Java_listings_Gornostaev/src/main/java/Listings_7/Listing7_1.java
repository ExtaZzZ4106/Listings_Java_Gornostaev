package Listings_7;

import java.io.File;

public class Listing7_1 {
    // Метод для рекурсивного удаления директории и её содержимого
    public static void deleteDir(String dirPath) {
        // Создаем объект File, представляющий директорию для удаления
        File walkDir = new File(dirPath);

        // Проверяем, существует ли указанная директория
        if (walkDir.exists()) {
            // Получаем список файлов и поддиректорий внутри текущей директории
            File[] dirList = walkDir.listFiles();

            // Проверяем, что список не пуст
            if (dirList != null) {
                // Начинаем цикл по всем элементам в полученном списке
                for (File f : dirList) {
                    // Если текущий элемент - директория, вызываем рекурсивно тот же метод для удаления поддиректории и её содержимого
                    if (f.isDirectory()) {
                        deleteDir(f.getAbsolutePath());
                    } else {
                        // Если текущий элемент - файл, удаляем его
                        f.delete();
                    }
                }
            }

            // После удаления всех поддиректорий и файлов, удаляем саму директорию
            walkDir.delete();
        }
    }

    public static void main(String[] args) {
        // Пример использования
        // Указываем путь к директории, которую хотим удалить
        String directoryPath = "C:\\Users\\ExtaZzZ4106\\Desktop\\Новая папка";
        // Вызываем метод для удаления директории
        deleteDir(directoryPath);
    }
}
