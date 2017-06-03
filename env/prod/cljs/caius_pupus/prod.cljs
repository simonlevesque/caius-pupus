(ns caius-pupus.prod
  (:require [caius-pupus.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
