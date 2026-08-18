package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview movieReview1 = new MovieReview();
        MovieReview movieReview2 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        // 영화 리뷰 정보 출력
        printReview(movieReview1.title, movieReview1.review);
        printReview(movieReview2.title, movieReview2.review);
    }

    public static void printReview(String title, String review) {
        System.out.println("영화 제목: " + title + ", 리뷰: " + review);
    }
}
