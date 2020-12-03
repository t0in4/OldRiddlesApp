package com.e.oldriddlesapp

import java.util.*
import kotlin.collections.ArrayList

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {



        val questionsList = ArrayList<Question> ()

        val que1 = Question(1, "Мин сирэйим аламас таас курдук оннук учугэй",
        R.drawable.first,
            "Сардаҥа",
            "Күн",
            "Муус",
            "Ый",
            3)
        questionsList.add(que1)
        val que2 = Question(2, "Көрө сытан сүүрүккэ аньар баар?",
        R.drawable.second,
        "Аньыы",
        "Батыйа",
        "Бидилгэх",
        "Айа",
        4)
        questionsList.add(que2)
        val que3 = Question(3, "Эргэл-дьэргэл эккири турарын ким да булан тутан ылбат?",
            R.drawable.third,
            "Куйаар Салгына",
            "Итии Салгын",
            "Тымныы Салгын",
            "Киһи тыына",
            2)
        questionsList.add(que3)
        val que4 = Question(4, "эргийэр-эргийэр - мэйиитэ иирбэт, көрөр-көрөр - бу турар диэн булбат?",
            R.drawable.four,
            "Ытык",
            "Холорук",
            "Бэдэр",
            "Эбэ балыга",
            1)
        questionsList.add(que4)
        val que5 = Question(5, "Эдьигээнтэн эриэн таба эргийбит?",
            R.drawable.five,
            "Эмэгэт былыт",
            "Саар былыт",
            "Тыал былыта",
            "Итир былыт",
            4)
        questionsList.add(que5)
        val que6 = Question(6, "эрбэх иһигэр эчики чуоҕур баар үһү?",
            R.drawable.second,
            "Хаарты",
            "Ынах",
            "Бэдэр",
            "Баарыс онньуу",
            1)
        questionsList.add(que6)
        val que7 = Question(7, "Үрүҥ аҕабыт баттаабыт бэчиэтэ хаһан даҕаны сүппэт",
            R.drawable.second,
            "Аат",
            "Батыйа",
            "Бэдэр",
            "Бил",
            1)
        questionsList.add(que7)
        val que8 = Question(8, "Көрө сытан сүүрүккэ аньар баар?",
            R.drawable.second,
            "Аньыы",
            "Билигэс",
            "Бэдэр",
            "Айа",
            4)
        questionsList.add(que8)
        val que9 = Question(2, "Көрө сытан сүүрүккэ аньар баар?",
            R.drawable.second,
            "Аньыы",
            "Батыйа",
            "Бэдэр",
            "Айа",
            4)
        questionsList.add(que9)
        val que10 = Question(2, "Көрө сытан сүүрүккэ аньар баар?",
            R.drawable.second,
            "Аньыы",
            "Батыйа",
            "Бэдэр",
            "Айа",
            4)
        questionsList.add(que10)
        Collections.shuffle(questionsList)
        return questionsList

    }
}