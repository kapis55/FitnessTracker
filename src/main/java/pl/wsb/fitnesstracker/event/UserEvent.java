package pl.wsb.fitnesstracker.event;

import jakarta.persistence.*;
import pl.wsb.fitnesstracker.user.api.User;

@Entity(name = "HealthMetricsUserEvent")
@Table(name = "USER_EVENT")
public class UserEvent {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @ManyToOne
  @JoinColumn(name = "event_id", nullable = false)
  private Event event;

  @Column(nullable = false)
  private String status;

  public UserEvent() {
  }

  public UserEvent(Long id, User user, Event event, String status) {
    this.id = id;
    this.user = user;
    this.event = event;
    this.status = status;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}