# Exploit POC of HTTP Parsers Inconsistency

Each folder has a simple app for you to text the bypasses as shown in this research: 

[Exploiting HTTP Parser inconsistencies](https://rafa.hashnode.dev/exploiting-http-parsers-inconsistencies)

# docker-compose command

Example of running some of the applications

```console
foo@bar:~$ cd node
foo@bar:~$ sudo docker-compose up --build --force-recreate --remove-orphans
```

# Node.js

|Nginx Version|Bypass Characters|
|---|---|
|1.22.0|\xA0|
|1.21.6|\xA0|
|1.20.2|\xA0, \x09, \x0C|
|1.18.0|\xA0, \x09, \x0C|
|1.16.1|\xA0, \x09, \x0C|

# Flask

|Nginx Version|Bypass Characters|
|---|---|
|1.22.0|\x85, \xA0|
|1.21.6|\x85, \xA0|
|1.20.2|\x85, \xA0, \x1F, \x1E, \x1D, \x1C, \x0C, \x0B|
|1.18.0|\x85, \xA0, \x1F, \x1E, \x1D, \x1C, \x0C, \x0B|
|1.16.1|\x85, \xA0, \x1F, \x1E, \x1D, \x1C, \x0C, \x0B|

