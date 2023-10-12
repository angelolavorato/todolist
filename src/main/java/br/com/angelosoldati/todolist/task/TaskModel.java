package br.com.angelosoldati.todolist.task;

import java.time.LocalDate;

public class TaskModel {

  /*
   * O que a tarefa deve ter:
   * ID
   * Usuário (ID_Usuário)
   * Descrição
   * Título
   * Data de início
   * Data de término
   * Prioridade
   */

  private UUID id;
  private String description;
  private String title;
  private LocalDateTime startAt;
  private LocalDateTime endAt;
}
