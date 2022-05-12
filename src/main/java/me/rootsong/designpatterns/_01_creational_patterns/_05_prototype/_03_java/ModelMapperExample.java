package me.rootsong.designpatterns._01_creational_patterns._05_prototype._03_java;

import me.rootsong.designpatterns._01_creational_patterns._05_prototype._02_after.GitHubIssue;
import me.rootsong.designpatterns._01_creational_patterns._05_prototype._02_after.GitHubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {
    
    public static void main(String[] args) {
        GitHubRepository repository = new GitHubRepository();
        repository.setUser("rootsong");
        repository.setName("live-study");
    
        GitHubIssue gitHubIssue = new GitHubIssue(repository);
        gitHubIssue.setId(1);
        gitHubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");
    
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData = modelMapper.map(gitHubIssue, GithubIssueData.class);
        System.out.println(githubIssueData.toString());
    }
}
