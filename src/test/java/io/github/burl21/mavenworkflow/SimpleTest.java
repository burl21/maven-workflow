package io.github.burl21.mavenworkflow;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleTest {

  @Test
  void test() {
    var foo = new Simple("foo");
    assertThat(foo.getName()).isEqualTo("foo");
    assertThat(foo.startsWith("f")).isTrue();
  }
}
