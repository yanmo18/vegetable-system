import request from '@/utils/request'

export function addMessage(data) {
  return request({
    url: '/system/message/add',
    method: 'post',
    data: data
  })
}

export function getMessageList(query) {
  return request({
    url: '/system/message/list',
    method: 'get',
    params: query
  })
}
