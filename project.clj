(defproject
  boot-project
  "0.0.0-SNAPSHOT"
  :repositories
  [["clojars" {:url "https://repo.clojars.org/"}]
   ["maven-central" {:url "https://repo1.maven.org/maven2"}]]
  :dependencies
  [[org.omcljs/om
    "1.0.0-alpha46"
    :exclusions
    [com.cognitect/transit-cljs]]
   [bidi "2.0.11" :exclusions [prismatic/schema ring/ring-core]]
   [org.clojure/clojure "1.9.0-alpha20"]
   [org.clojure/clojurescript
    "1.9.229"
    :exclusions
    [org.clojure/clojure]]
   [kibu/pushy
    "0.3.6"
    :exclusions
    [org.clojure/clojure org.clojure/clojurescript]]
   [com.cognitect/transit-cljs
    "0.8.239"
    :exclusions
    [org.clojure/clojure]]
   [hiccup "1.0.5" :exclusions [org.clojure/clojure]]
   [com.cognitect/transit-clj "0.8.288"]
   [org.clojure/tools.logging
    "0.3.1"
    :exclusions
    [org.clojure/clojure]]
   [org.slf4j/slf4j-log4j12 "1.7.21"]
   [log4j
    "1.2.17"
    :exclusions
    [javax.mail/mail
     com.sun.jmdk/jmxtools
     javax.jms/jms
     com.sun.jmx/jmxri]]
   [environ "1.1.0" :exclusions [org.clojure/clojure]]
   [ring "1.6.0-beta6" :exclusions [org.clojure/clojure commons-codec]]
   [ring/ring-headers
    "0.3.0-beta1"
    :exclusions
    [org.clojure/clojure ring/ring-core]]
   [com.datomic/datomic-free
    "0.9.5394"
    :exclusions
    [org.clojure/clojure
     org.slf4j/slf4j-log4j12
     commons-codec
     com.google.guava/guava
     org.slf4j/slf4j-nop
     org.slf4j/slf4j-api
     org.slf4j/log4j-over-slf4j]]
   [com.stuartsierra/component
    "0.3.1"
    :exclusions
    [org.clojure/clojure]]
   [org.danielsz/system
    "0.3.2-20170106.222247-13"
    :exclusions
    [org.clojure/clojure]]
   [boot-environ "1.1.0"]
   [com.cemerick/piggieback
    "0.2.1"
    :scope
    "test"
    :exclusions
    [org.clojure/clojure org.clojure/clojurescript]]
   [adzerk/boot-cljs "1.7.228-1" :scope "test"]
   [adzerk/boot-cljs-repl "0.3.3" :scope "test"]
   [adzerk/boot-reload "0.4.12" :scope "test"]
   [org.clojure/tools.nrepl
    "0.2.12"
    :scope
    "test"
    :exclusions
    [org.clojure/clojure]]
   [weasel
    "0.7.0"
    :scope
    "test"
    :exclusions
    [org.clojure/clojure org.clojure/clojurescript]]
   [com.taoensso/sente "1.11.0"]
   [org.clojure/core.async "0.2.395"]
   [onetom/boot-lein-generate "0.1.3" :scope "test"]]
  :source-paths
  ["src/shared" "src/clj"]
  :resource-paths
  ["resources"])