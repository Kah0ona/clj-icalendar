(defproject net.clojars.kah0ona/clj-icalendar "0.3.1"
  :description "wrapper over ical4j to generate ics, forked from clj-icalendar/clj-icalendar"
  :url "http://github.com/jeffmad/clj-icalendar"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url  "https://github.com/jeffmad/clj-icalendar"}
  :dependencies [[org.clojure/clojure "1.11.0"]
                 [org.mnode.ical4j/ical4j "3.2.4"]]
  :global-vars {*warn-on-reflection* false
                *assert*             false})
