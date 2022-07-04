package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articlesList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Article article = new Article(data[0],data[1],data[2]);
            articlesList.add(article);

        }
        String input = scanner.nextLine();
        switch (input){
            case "title":
                articlesList//.stream().sorted((t1,t2)->t2.getTitle().compareTo(t1.getTitle()))
                        .forEach(t -> System.out.println(t.toString()));
                break;
            case "content":
                articlesList//.stream().sorted((t1,t2)->t2.getContent().compareTo(t1.getContent()))
                        .forEach(t -> System.out.println(t.toString()));
                break;
            case "author":
                articlesList//.stream().sorted((t1,t2)->t2.getAuthor().compareTo(t1.getAuthor()))
                        .forEach(t -> System.out.println(t.toString()));
                break;
        }

    }

}
