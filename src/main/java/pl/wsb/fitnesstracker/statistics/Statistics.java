package pl.wsb.fitnesstracker.statistics;

import jakarta.persistence.*;
import pl.wsb.fitnesstracker.user.api.User;

@Entity(name = "StatisticsEntity")
@Table(name = "statistics")
public class Statistics {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne
  @JoinColumn(name = "user_id", nullable = false, unique = true)
  private User user;

  @Column(nullable = false)
  private Double totalDistance;

  @Column(nullable = false)
  private Double totalCalories;

  public Statistics() {}

  public Long getId() {
    return id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Double getTotalDistance() {
    return totalDistance;
  }

  public void setTotalDistance(Double totalDistance) {
    this.totalDistance = totalDistance;
  }

  public Double getTotalCalories() {
    return totalCalories;
  }

  public void setTotalCalories(Double totalCalories) {
    this.totalCalories = totalCalories;
  }
}