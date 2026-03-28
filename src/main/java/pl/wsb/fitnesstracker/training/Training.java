package pl.wsb.fitnesstracker.training;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import pl.wsb.fitnesstracker.user.api.User;
import pl.wsb.fitnesstracker.activity.ActivityType;

@Entity
@Table(name = "trainings")
public class Training {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @Column(nullable = false)
  private LocalDateTime startTime;

  @Column(nullable = false)
  private LocalDateTime endTime;

  @ManyToOne
  @JoinColumn(name = "activity_type_id", nullable = false)
  private ActivityType activityType;

  @Column(nullable = false)
  private Double distance;

  @Column(nullable = false)
  private Double averageSpeed;

  public Training() {
  }

  // ===== GETTERY / SETTERY =====

  public Long getId() {
    return id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public LocalDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalDateTime startTime) {
    this.startTime = startTime;
  }

  public LocalDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalDateTime endTime) {
    this.endTime = endTime;
  }

  public ActivityType getActivityType() {
    return activityType;
  }

  public void setActivityType(ActivityType activityType) {
    this.activityType = activityType;
  }

  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public Double getAverageSpeed() {
    return averageSpeed;
  }

  public void setAverageSpeed(Double averageSpeed) {
    this.averageSpeed = averageSpeed;
  }
}