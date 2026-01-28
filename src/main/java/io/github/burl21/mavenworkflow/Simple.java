package io.github.burl21.mavenworkflow;

import org.apache.commons.lang3.Strings;

/**
 * A simple wrapper class for string operations.
 * <p>
 * This class provides basic string functionality including case-insensitive prefix checking.
 * </p>
 */
public final class Simple {
  private final String name;

  /**
   * Constructs a new Simple instance with the specified name.
   *
   * @param name the name to be stored in this instance
   */
  public Simple(String name) {
    this.name = name;
  }

  /**
   * Returns the name stored in this instance.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Checks if the name starts with the specified prefix using case-insensitive comparison.
   *
   * @param prefix the prefix to check
   * @return {@code true} if the name starts with the prefix (case-insensitive), {@code false} otherwise
   */
  public boolean startsWith(String prefix) {
    return Strings.CI.startsWith(name, prefix);
  }

  public boolean equalsNameIgnoreCase(String other) {
    return Strings.CI.equals(name, other);
  }
}
