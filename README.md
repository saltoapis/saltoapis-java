# saltoapis-java

## Installation

To start using the Saltoapis Java library first you need to add this repository to your Gradle or Maven configuration.

### Gradle

To download a saltoapis library you have to add the saltoapis-java repository to your project.

```gradle
repositories {
    maven {
        name = "github-saltoapis-java"
        url = uri("https://maven.pkg.github.com/saltoapis/saltoapis-java")
        credentials {
            username = localProps['username']
            password = localProps['password']
        }
    }
}
```

Then you can add any saltoapis-java library to your project.

```gradle
dependencies {
    implementation "com.saltoapis.nebula:nebula-user-v1:$saltoapisVersion"
}
```

### Maven

If you are using Maven, you can add the saltoapis-java repository in your `.m2/settings.xml` file like this.

```xml
<settings 
    xmlns="http://maven.apache.org/SETTINGS/1.0.0" 
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
    http://maven.apache.org/xsd/settings-1.0.0.xsd">

    <activeProfiles>
        <activeProfile>github-saltoapis-java</activeProfile>
    </activeProfiles>

    <profiles>
        <profile>
            <id>github-saltoapis-java</id>
            <repositories>
                <repository>
                    <id>central</id>
                    <url>https://repo1.maven.org/maven2</url>
                </repository>
                <repository>
                    <id>github-saltoapis-java</id>
                    <url>https://maven.pkg.github.com/saltoapis/saltoapis-java/</url>
                    <snapshots>
                        <enabled>true</enabled>
                    </snapshots>
                </repository>
            </repositories>
        </profile>
    </profiles>

    <servers>
        <server>
            <id>github-saltoapis-java</id>
            <username>{your username}</username>
            <password>{your github token}</password>
        </server>
    </servers>
```

Then you can add any saltoapis-java library to your project.

```xml
<dependency>
    <groupId>com.saltoapis.nebula</groupId>
    <artifactId>nebula-user-v1</artifactId>
    <version>{saltoapis version}</version>
</dependency>
```

## Usage

The SDK provides a simple gRPC interceptor that will automatically get and refresh valid access tokens and will include in all gRPC requests.

1. Create a gRPC channel pointing to the Salto APIs server

```java
ManagedChannel originChannel = Grpc.newChannelBuilder(
        "nebula.saltoapis.com",
        TlsChannelCredentials.create()
    ).build();
```


2. Create the saltoapis auth interceptor and intercept the created channel. The interceptor will automatically retrieve and inject valid access tokens.

> **Note**
> You should always request the following scopes when authenticating:
> ```
> openid, offline, profile, email, https://saltoapis.com/auth/nebula
> ```

```java
var scopes = new String[] { "openid", "offline", "profile", "email", "https://saltoapis.com/auth/nebula" };
var authInterceptor = new SaltoapisAuthInterceptor(
    clientId, clientSecret, scopes,
    // you can optionally override the auth server
    "account.saltosystems.com");

var channel = ClientInterceptors.intercept(originChannel, authInterceptor);
```

3. Create the gRPC client stub using the intercepted channel.

```java
var service = UserServiceGrpc.newFutureStub(channel);

var request = ListUsersRequest.newBuilder()
    .setParent("installations/01GP0N4J6DBB6M8RRGCX4F99F6")
    .setPageSize(10)
    .build();
var response = service.listUsers(request);
```
