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
            "One",
            "Two",
            "Three",
            "Four",
            4)
        questionsList.add(que1)
        val que2 = Question(2, "Көрө сытан сүүрүккэ аньар баар?",
        R.drawable.second,
        "Аньыы",
        "Батыйа",
        "Бэдэр",
        "Айа",
        4)
        questionsList.add(que2)
        val que3 = Question(2, "Көрө сытан сүүрүккэ аньар баар?",
            R.drawable.second,
            "Аньыы",
            "Батыйа",
            "Бэдэр",
            "Айа",
            4)
        questionsList.add(que3)
        val que4 = Question(2, "Көрө сытан сүүрүккэ аньар баар?",
            R.drawable.second,
            "Аньыы",
            "Батыйа",
            "Бэдэр",
            "Айа",
            4)
        questionsList.add(que4)
        val que5 = Question(2, "Көрө сытан сүүрүккэ аньар баар?",
            R.drawable.second,
            "Аньыы",
            "Батыйа",
            "Бэдэр",
            "Айа",
            4)
        questionsList.add(que5)
        val que6 = Question(2, "Көрө сытан сүүрүккэ аньар баар?",
            R.drawable.second,
            "Аньыы",
            "Батыйа",
            "Бэдэр",
            "Айа",
            4)
        questionsList.add(que6)
        val que7 = Question(2, "Көрө сытан сүүрүккэ аньар баар?",
            R.drawable.second,
            "Аньыы",
            "Батыйа",
            "Бэдэр",
            "Айа",
            4)
        questionsList.add(que7)
        val que8 = Question(2, "Көрө сытан сүүрүккэ аньар баар?",
            R.drawable.second,
            "Аньыы",
            "Батыйа",
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