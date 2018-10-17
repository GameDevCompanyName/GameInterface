package gdcn.BeastMaster.World;

public interface Monument {

    /** Памятник - это объект, который с определённой вероятностью встречается в локации.
     * Всё, что у него есть - название и описание. (Возможно, ещё будет отдельная картинка)
     * Главная цель памятника в игре - помочь раскрыть лор для игрока.
     *
     * По хорошему варианты памятников будут храниться отдельно в каких-нибудь файлах и будут подгружаться
     * при генерации нового мира. В файлы можно будет не меняя код добавлять новые названия и описания памятников.**/

    /**
     * Возвращает название памятника (Напирмер, "заброшенная крепость" или "кладбище")
     **/
    public String getName();

    /**
     * Возвращает описание объекта, которое будет выводиться при взаимодействии с ним.
     **/
    public String getDescription();

}