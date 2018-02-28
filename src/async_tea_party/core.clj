(ns async-tea-party.core
  (:require [clojure.core.async :as async])
)

(def tea-channel (async/chan 10))

(async/>!! tea-channel :cup-of-tea)

(async/<!! tea-channel)
