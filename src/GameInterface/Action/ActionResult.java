package GameInterface.Action;

public enum ActionResult {

    HIT, DODGE, MISS, BLOCK, CRITICAL, KILLED

    /**
     * HIT - Обычное попадание/успешное применение к цели
     * DODGE - Цель избежала попадания/применения
     * MISS - Не удалось попасть по цели/применить
     * BLOCK - Заблокированное попадание/приминение
     * CRITICAL - Критическое попадание/приминение
     * KILLED - Цель метрва
     * **/

}