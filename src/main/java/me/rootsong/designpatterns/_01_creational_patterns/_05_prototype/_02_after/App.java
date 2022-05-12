package me.rootsong.designpatterns._01_creational_patterns._05_prototype._02_after;

public class App {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        GitHubRepository repository = new GitHubRepository();
        repository.setUser("whiteShip");
        repository.setName("live-study");
    
        GitHubIssue gitHubIssue = new GitHubIssue(repository);
        gitHubIssue.setId(1);
        gitHubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");
    
        String url = gitHubIssue.getUrl();
        System.out.println(url);
    
        GitHubIssue clone = (GitHubIssue) gitHubIssue.clone();
    
        System.out.println(clone.getUrl());
        System.out.println(clone !=gitHubIssue);
        System.out.println(clone.equals(gitHubIssue));
        System.out.println(clone.getClass() == gitHubIssue.getClass());
        System.out.println(clone.getRepository() == gitHubIssue.getRepository());
    }
}
