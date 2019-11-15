FROM java:8
RUN mkdir /hiFICOders
COPY ./target/mqproducer-0.0.1-SNAPSHOT.jar /hiFICOders
ENTRYPOINT ["/hiFICOders/mqproducer-0.0.1-SNAPSHOT.jar", "run"]