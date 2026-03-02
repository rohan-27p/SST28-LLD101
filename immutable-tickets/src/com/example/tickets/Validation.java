package com.example.tickets;

import java.util.regex.Pattern;

/**
 * Central place for validation helpers.
 *
 * Students can extend this as needed.
 */
public final class Validation {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[^@]+@[^@]+\\.[^@]+$");

    private Validation() {}

    public static void requireNonEmpty(String value, String field) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " cannot be empty");
        }
    }

    public static void requireMaxLength(String value, int max, String field) {
        if (value != null && value.length() > max) {
            throw new IllegalArgumentException(field + " exceeds max length " + max);
        }
    }

    public static void requirePattern(String value, String regex, String field) {
        if (value != null && !value.matches(regex)) {
            throw new IllegalArgumentException(field + " has invalid format");
        }
    }

    public static void requireEmail(String value, String field) {
        if (!EMAIL_PATTERN.matcher(value).matches()) {
            throw new IllegalArgumentException(field + " must be a valid email");
        }
    }
}