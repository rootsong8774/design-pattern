package me.rootsong.designpatterns._01_creational_patterns._05_prototype._02_after;

import java.util.Objects;

public class GitHubIssue implements Cloneable {
    
    private int id;
    
    private String title;
    
    private GitHubRepository repository;
    
    public GitHubIssue(GitHubRepository repository) {
        this.repository = repository;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public GitHubRepository getRepository() {
        return repository;
    }
    
    public void setRepository(
        GitHubRepository repository) {
        this.repository = repository;
    }
    
    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
            repository.getUser(),
            repository.getName(),
            this.getId());
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        GitHubRepository repository = new GitHubRepository();
        repository.setUser(this.repository.getUser());
        repository.setName(this.repository.getName());
    
        GitHubIssue gitHubIssue = new GitHubIssue(repository);
        gitHubIssue.setId(this.id);
        gitHubIssue.setTitle(this.title);
        return super.clone();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitHubIssue that = (GitHubIssue) o;
        return getId() == that.getId() && Objects.equals(getTitle(), that.getTitle())
            && Objects.equals(getRepository(), that.getRepository());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getRepository());
    }
}
