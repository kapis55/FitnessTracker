package pl.wsb.fitnesstracker.activity;

import jakarta.persistence.*;

@Entity
@Table(name = "activity_type")
public class ActivityType {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String activityType;

  public ActivityType() {
  }

  public Long getId() {
    return id;
  }

  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }
}