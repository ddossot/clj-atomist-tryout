(ns net.dossot.test.clj-atomist-tryout.rest.t-status
  (:require [net.dossot.test.clj-atomist-tryout.rest.status :as status]
            [midje.sweet :refer :all]))

(fact-group
 :unit

 (fact "status returns OK with the correct version"
       (status/get-status {:version "1.0.0"})
       =>
   (contains {:status 200 :body (contains {:status "OK" :version "1.0.0"})})))
