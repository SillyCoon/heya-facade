(ns heya-facade.core
    (:require
      [reagent.core :as r]
      [reagent.dom :as d]))

(defn main [])

;; -------------------------
;; Views

(defn home-page []
  [:div [:h2 "Welcome to ol"]])

;; -------------------------
;; Initialize app

(+ 1 1)

(defn mount-root []
  (d/render [home-page] (.getElementById js/document "app")))

(defn ^:export init! []
  (mount-root))
