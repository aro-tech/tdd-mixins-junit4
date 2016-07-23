# tdd-mixins-junit4
Java-8 default interfaces useful for a JUnit 4 test fixture
Contains AssertJ and the ExtendedMockito mixins as well as a mixin for JUnit asserts and AllAssertions which combines JUnit and AssertJ assertions
Does not require any specific test library such as JUnit or TestNG

Requires Java 8 (or higher)


##Latest release

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.aro-tech/tdd-mixins-junit4/badge.svg)](http://search.maven.org/#artifactdetails|com.github.aro-tech|tdd-mixins-junit4|0.9.3|jar)

v0.9.3: [Release notes on github] (https://github.com/aro-tech/tdd-mixins-junit4/releases/tag/v0.9.3)

[Binary downloads] (https://oss.sonatype.org/content/groups/public/com/github/aro-tech/tdd-mixins-junit4/0.9.3/ "binaries")

In Maven:

```html
<dependency>
  <groupId>com.github.aro-tech</groupId>
  <artifactId>tdd-mixins-junit4</artifactId>
  <version>0.9.3</version>
  <scope>test</scope>
</dependency>
```

##Example usage 
```
	public class MyTest implements ExtendedMockito, AllAssertions { 
	...
```	

```
	when(mock.extractInformationFrom(toStringContainsAllOf("Gollum", "Smeagol"))).thenReturn("Shire. Baggins.");
```

```
	assertThat(answer).contains("Shire", "Baggins");
```
	
```
	assertTrue(c == '*');
```		
 
##Blog
[![The Green Bar](https://img.shields.io/badge/My_Blog:-The_Green_Bar-brightgreen.svg)](https://thegreenbar.wordpress.com/)
