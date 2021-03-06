/**
 * Copyright (c) 2014  Andrey Hihlovskiy
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 */
//DUPLICATED, must be part of a common bundle
package de.monkeyworks.buildmonkey.pde.mavenize

import groovy.transform.ToString

/**
 * POJO class holding data on dependency bundle. Used by {@link org.akhikhl.unpuzzle.osgi2maven.Pom} class.
 */
@ToString
public final class DependencyBundle {
    String group
    String name
    String version
    String visibility
    String resolution
}

