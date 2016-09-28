package com.github.shuvigoss.commons.base;

/**
 * @author shuvigoss@gmail.com (Wei Shu)
 */
class ArgsBean {

  void isTrue(boolean bln) {
    Args.isTrue(bln, "expression is not true");
  }

  void isFalse(boolean b) {
    Args.isFalse(b, "expression is not false");
  }

  void notNull(Object obj) {
    Args.notNull(obj, "obj is null");
  }

  void notNullNotEmpty(Object obj) {
    Args.notNullNotEmpty(obj, "obj is null or empty");
  }
}
