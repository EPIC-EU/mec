package teammates.common.util;

/**
 * The type object that defines an email based on its purpose.
 */
public enum EmailType {

    // CHECKSTYLE.OFF:JavadocVariable enum names are self-documenting

    FEEDBACK_OPENING("MEC: Feedback session now open [Course: %s][Feedback Session: %s]"),
    FEEDBACK_SESSION_REMINDER("MEC: Feedback session reminder [Course: %s][Feedback Session: %s]"),
    FEEDBACK_SUBMISSION_CONFIRMATION(
            "MEC: Feedback responses successfully recorded [Course: %s][Feedback Session: %s]"),
    FEEDBACK_CLOSING("MEC: Feedback session closing soon [Course: %s][Feedback Session: %s]"),
    FEEDBACK_CLOSED("MEC: Feedback session closed [Course: %s][Feedback Session: %s]"),
    FEEDBACK_PUBLISHED("MEC: Feedback session results published [Course: %s][Feedback Session: %s]"),
    FEEDBACK_UNPUBLISHED("MEC: Feedback session results unpublished [Course: %s][Feedback Session: %s]"),
    STUDENT_EMAIL_CHANGED("MEC: Summary of course [%s][Course ID: %s]"),
    NEW_INSTRUCTOR_ACCOUNT("MEC: Welcome to MEC! %s"),
    STUDENT_COURSE_JOIN("MEC: Invitation to join course [%s][Course ID: %s]"),
    STUDENT_COURSE_REJOIN_AFTER_GOOGLE_ID_RESET("MEC: Your account has been reset for course [%s][Course ID: %s]"),
    INSTRUCTOR_COURSE_JOIN("MEC: Invitation to join course as an instructor [%s][Course ID: %s]"),
    INSTRUCTOR_COURSE_REJOIN_AFTER_GOOGLE_ID_RESET("MEC: Your account has been reset for course [%s][Course ID: %s]"),
    USER_COURSE_REGISTER("MEC: Registered for Course [%s][Course ID: %s]"),
    SEVERE_LOGS_COMPILATION("MEC (%s): Severe Error Logs Compilation"),
    SESSION_LINKS_RECOVERY("MEC: Access links for recent feedback sessions");

    private final String subject;

    EmailType(String subject) {
        this.subject = subject;
    }

    /**
     * Gets the subject heading of this email type.
     */
    public String getSubject() {
        return subject;
    }

}
