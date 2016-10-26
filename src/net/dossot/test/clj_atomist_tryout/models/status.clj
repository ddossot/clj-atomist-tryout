(ns net.dossot.test.clj-atomist-tryout.models.status
  (:require [schema.core :as s]))

(s/defschema Status
  "The status of this service"
  {:version s/Str
   :status  (s/enum "OK" "WARN" "ERROR")})
