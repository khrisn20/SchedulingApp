package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class User {
    private int user_id;
    private String user_name;
    private String password;
    private LocalDateTime create_date;
    private String created_by;
    private Timestamp last_update;
    private String last_updated_by;
}
